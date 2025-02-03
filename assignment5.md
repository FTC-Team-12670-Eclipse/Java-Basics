Take a look at the RobotHardware class in the FTCLib-Example repository - https://github.com/FTC-Team-12670-Eclipse/FTCLib-Example/tree/main

- Why is the RobotHardware class constructor private. Is the constructor being used anywhere and how?
- Why is the `INSTANCE` variable defined as static? What does static mean?
- Write the documentation describing RobotHardware class and make a pull request for that documentation in the [FTCLib-Example repository](https://github.com/FTC-Team-12670-Eclipse/FTCLib-Example/tree/main). The best documentation will be merged into the FTCLib-Example branch.
- Now look at [LiftSubsystem.java line 13]([https://github.com/FTC-Team-12670-Eclipse/FTCLib-Example/blob/main/TeamCode/src/main/java/org/firstinspires/ftc/teamcode/subsystems/LiftSubsystem.java](https://github.com/FTC-Team-12670-Eclipse/FTCLib-Example/blob/e50d95dea484a38fe8ad716c7db38fef853d5279/TeamCode/src/main/java/org/firstinspires/ftc/teamcode/subsystems/LiftSubsystem.java#L13)). Why couldn't you call RobotHardware.getInstance() here? Why was the decision made to pass RobotHardware in the constructor for the LiftSubsystem class and why is that the best decision?
