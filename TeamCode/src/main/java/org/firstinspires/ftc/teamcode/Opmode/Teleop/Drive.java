package org.firstinspires.ftc.teamcode.Opmode.Teleop;


import com.acmerobotics.dashboard.config.Config;
import com.acmerobotics.dashboard.telemetry.TelemetryPacket;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.Opmode.Blueprint.Distance;
import org.firstinspires.ftc.teamcode.Opmode.Blueprint.FSM_Lift;
import org.firstinspires.ftc.teamcode.Opmode.Blueprint.FSM_Turret;
//import org.firstinspires.ftc.teamcode.Opmode.Blueprint.Test_sensor;
import org.firstinspires.ftc.teamcode.Opmode.System.TelemetryX;
import org.firstinspires.ftc.teamcode.pedroPathing.Constants;
import java.util.function.Supplier;

@Config
@TeleOp
public class Drive extends OpMode {

    TelemetryX telemetryX;
//    Test_sensor check_ball;
    Drawing drawing;

    public static int debug_key = 0;
    public static boolean test = false;

//    double x_joy,y_joy,rx_joy;

    ////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public void init() {
        telemetryX = new TelemetryX();
        drawing = new Drawing();

        telemetryX.init(telemetry);

//        FL = hardwareMap.get(DcMotorEx.class, "Front_L");
//        FR = hardwareMap.get(DcMotorEx.class, "Front_R");
//        BL = hardwareMap.get(DcMotorEx.class, "Back_L");
//        BR = hardwareMap.get(DcMotorEx.class, "Back_R");

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public void start() {
    }

    @Override
    public void loop() {

//        x_joy = gamepad1.left_stick_x;
//        y_joy = -gamepad1.left_stick_y;
//        rx_joy = gamepad1.right_stick_x;
//        FL.setPower( y_joy + x_joy + rx_joy );
//        FR.setPower( y_joy - x_joy - rx_joy );
//        BL.setPower( y_joy - x_joy + rx_joy );
//        BR.setPower( y_joy + x_joy - rx_joy );

        telemetryX.update();
    }
    ////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////

    public void debugging(){
        switch (debug_key) {
            case 0:
                telemetryX.addData("test",test, TelemetryX.Target.BOTH);
                break;
            case 1:
                break;

        }
    }

}


//        follower = Constants.createFollower(hardwareMap);
//        follower.setStartingPose(new Pose(72,-72,0));
//        follower.update();

//        follower.startTeleOpDrive();

//        drawing.field_image();
//        drawing.drawRobot(follower.getPose(), "red");
//        drawing.sendPacket();
//        follower.update();
