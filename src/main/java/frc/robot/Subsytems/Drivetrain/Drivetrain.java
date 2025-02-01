package frc.robot.Subsytems.Drivetrain;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveTConstants;

public class Drivetrain  extends SubsystemBase{
    TalonSRX frontleft = new TalonSRX(DriveTConstants.frontleft);
    TalonSRX backleft = new TalonSRX(DriveTConstants.backLeft);
    TalonSRX frontRight = new TalonSRX(DriveTConstants.frontRight);
    TalonSRX backRight = new TalonSRX(DriveTConstants.backRight);

    public Drivetrain() {
        backleft.follow(frontleft);
        backRight.follow(frontRight);

        frontleft.setInverted(false);
    }

    public void arcadeDrive(double xSpeed, double zRotate) {
        xSpeed = MathUtil.applyDeadband(xSpeed, 0.1);
        zRotate = MathUtil.applyDeadband(zRotate, 0.1);    

        if (xSpeed  > 0 && xSpeed  <  0.9) xSpeed  -= 0.1;
        if (xSpeed  < 0 && xSpeed  > -0.9) xSpeed  += 0.1;
        if (zRotate > 0 && zRotate <  0.9) zRotate -= 0.1;
        if (zRotate < 0 && zRotate > -0.9) zRotate += 0.1;

        xSpeed *= DriveTConstants.maxDriveSpeed;
        zRotate *= DriveTConstants.maxTurnSpeed;
    }

}