/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

// import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public abstract class HolonomicDriveTrain extends DriveTrain {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private double mAdjustmentAngle = 0;
  private boolean mFieldOriented = true;

  public HolonomicDriveTrain(double width, double length) {
    super(width, length);
  }

  public double getAdjustmentAngle() {
    return mAdjustmentAngle;
  }

  public abstract double getGyroAngle();

  public abstract double getRawGyroAngle();

  public void holonomicDrive(double forward, double strafe, double rotation) {
    holonomicDrive(forward, strafe, rotation, isFieldOriented());
  }

  public abstract void holonomicDrive(double forward, double strafe, double rotation, boolean feildOriented);

  @Override
  protected void initDefaultCommand() {
    // setDefaultCommand(new HolonomicDriveCommand(this));
    // Make command
  }

  public boolean isFieldOriented() {
    return mFieldOriented;
  }

  public void setAdjustmentAngle(double adjustmentAngle) {
    // System.out.printf
    // Print out angle
  }
}
