package org.firstinspires.ftc.teamcode.Opmode.System;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.acmerobotics.dashboard.FtcDashboard;


public class  TelemetryX {
    FtcDashboard dashboard = FtcDashboard.getInstance();
    Telemetry dashboardTelemetry = dashboard.getTelemetry();
    Telemetry telemetry;

    public void init(Telemetry t){
        telemetry = t;
    }

    public enum Target {
        Drive,DashBoard,BOTH
    }

    public void addData(String head, Object child, Target key){
        switch (key) {
            case DashBoard:
                dashboardTelemetry.addData(head, child);
                break;
            case Drive:
                telemetry.addData(head, child);
                break;
            case BOTH:
                dashboardTelemetry.addData(head, child);
                telemetry.addData(head, child);
                break;
        }
    }

    public void update(){
        dashboardTelemetry.update();
        telemetry.update();
    }
    public void clear(){
        dashboardTelemetry.clear();
        telemetry.clear();
    }
}


