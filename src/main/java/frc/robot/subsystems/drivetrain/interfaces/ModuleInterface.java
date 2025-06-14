package frc.robot.subsystems.drivetrain.interfaces;

import edu.wpi.first.math.kinematics.SwerveModulePosition;
import edu.wpi.first.math.kinematics.SwerveModuleState;
import edu.wpi.first.units.measure.Angle;
import edu.wpi.first.units.measure.Voltage;

public interface ModuleInterface {

  void setDriveMotorVoltage(Voltage voltage);

  void setAngleMotorVoltage(Voltage voltage);

  void setModuleState(SwerveModuleState desiredState);

  SwerveModuleState getModuleState();

  SwerveModulePosition getModulePosition();

  Angle getRawWheelPosition();

  void stop();
}
