package frc.robot.Subsytems.Drivetrain;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveTConstants;

public class Drivetrain  extends SubsystemBase{
    TalonSRX frontleft = new TalonSRX(DriveTConstants.frontleft);
    TalonSRX backleft = new TalonSRX(DriveTConstants.backLeft);
    TalonSRX frontRight = new TalonSRX(DriveTConstants.frontRight);
    TalonSRX backRight = new TalonSRX(DriveTConstants.backRight);


}