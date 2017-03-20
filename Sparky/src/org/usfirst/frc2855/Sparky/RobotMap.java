// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2855.Sparky;

import org.usfirst.frc2855.Sparky.SPIGyro.ADXRS453Gyro;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.CANTalon;
import com.ctre.CANTalon.FeedbackDevice;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Ultrasonic;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static CANTalon driveCANTalon1;
    public static CANTalon driveCANTalon2;
    public static CANTalon driveCANTalon3;
    public static CANTalon driveCANTalon4;
    public static RobotDrive driveRobotDrive41;
    public static Ultrasonic driveUltrasonic1;
    public static DoubleSolenoid gearArmPrototypeGearDoubleSolenoid;
    public static DoubleSolenoid gearArmPrototypeArmDoubleSolenoid;
    public static CANTalon shooterActivateCANTalon1;
    public static I2C pixy;
    public static ADXRS453Gyro gyro;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveCANTalon1 = new CANTalon(1);
        LiveWindow.addActuator("Drive1", "CAN Talon 1", driveCANTalon1);
        
        driveCANTalon2 = new CANTalon(2);
        LiveWindow.addActuator("Drive2", "CAN Talon 2", driveCANTalon2);
        
        driveCANTalon3 = new CANTalon(3);
        LiveWindow.addActuator("Drive3", "CAN Talon 3", driveCANTalon3);
        
        driveCANTalon4 = new CANTalon(4);
        LiveWindow.addActuator("Drive4", "CAN Talon 4", driveCANTalon4);
        
        driveRobotDrive41 = new RobotDrive(driveCANTalon3, driveCANTalon4,
              driveCANTalon1, driveCANTalon2);
        
        driveRobotDrive41.setSafetyEnabled(true);
        driveRobotDrive41.setExpiration(0.1);
        driveRobotDrive41.setSensitivity(0.5);
        driveRobotDrive41.setMaxOutput(1.0);

        driveUltrasonic1 = new Ultrasonic(0, 1);
        LiveWindow.addSensor("Drive", "Ultrasonic 1", driveUltrasonic1);
        
        gearArmPrototypeGearDoubleSolenoid = new DoubleSolenoid(0, 0, 1);
        LiveWindow.addActuator("Gear Arm Prototype", "Gear Double Solenoid", gearArmPrototypeGearDoubleSolenoid);
        
        gearArmPrototypeArmDoubleSolenoid = new DoubleSolenoid(0, 2, 3);
        LiveWindow.addActuator("Gear Arm Prototype 2", "Arm Double Solenoid", gearArmPrototypeArmDoubleSolenoid);
        
        shooterActivateCANTalon1 = new CANTalon(5);
        LiveWindow.addActuator("ShooterActivate", "CAN Talon 5", shooterActivateCANTalon1);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        shooterActivateCANTalon1.setFeedbackDevice(FeedbackDevice.CtreMagEncoder_Relative);
        shooterActivateCANTalon1.reverseSensor(false);
        shooterActivateCANTalon1.configNominalOutputVoltage(+0.0f, -0.0f);
        shooterActivateCANTalon1.configPeakOutputVoltage(+12.0f, -0.0f);
        shooterActivateCANTalon1.setProfile(0);
        
        pixy = new I2C(edu.wpi.first.wpilibj.I2C.Port.kOnboard, 0x54);
        
        gyro = new ADXRS453Gyro();
    }
}
