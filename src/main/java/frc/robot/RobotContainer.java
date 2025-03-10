// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Subsytems.Drivetrain.Drivetrain;

public class RobotContainer {
  private final CommandXboxController m_CommandXboxController = new CommandXboxController(0);  
  private final Drivetrain drivetrain = new Drivetrain();
  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    drivetrain.setDefaultCommand (
      new RunCommand(() -> drivetrain.arcadeDrive(
    m_CommandXboxController.getLeftY(),
    m_CommandXboxController.getRightX()), drivetrain)
  );
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
