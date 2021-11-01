// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ColorWheelArm;

public class RaiseColorWheelArm extends CommandBase {
  /** Creates a new RaiseColorWheelArm. */
  private final ColorWheelArm m_colorWheelArm;
  public RaiseColorWheelArm(ColorWheelArm colorWheelArm) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_colorWheelArm = colorWheelArm;
    addRequirements(m_colorWheelArm);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_colorWheelArm.liftServo();
    double angle = m_colorWheelArm.get();
    SmartDashboard.putNumber("ServoAngle", angle);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_colorWheelArm.stopServo();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    // if(m_colorWheelArm.get() >= 0.3) {
    //   return true;
    // }
    // else{
    //   return false;
    // }
    return false;
  }
}