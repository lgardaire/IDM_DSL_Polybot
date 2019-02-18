# IDM_DSL_Polybot

DSL implementation for a robot Polybot in V-Rep

## Developer

Loïc Gardaire

## Tools needed

- [Gemoc Studio](https://ci.inria.fr/gemoc/job/gemoc-studio-eclipsefork/job/concurrency-coordination/lastSuccessfulBuild/artifact/gemoc-studio/gemoc_studio/releng/org.eclipse.gemoc.gemoc_studio.product/target/products/)
- [V-Rep](http://www.coppeliarobotics.com/downloads.html)

## How to use my project

After cloning the project, open `GemocStudio` and import the project using : *File -> Import -> General -> Projects From Folders or Archive* and choose the cloning project folder.

After that, you have to create a Runtime Eclipse Application and link the Polybot library.

### Create the application and link the Polybot library

To create the new Eclipse application, click on the little arrow next to the bug icon or the Run icon on the toolbar, depending on if you want to run or debug.
Click on *Run / Debug configurations*
Choose the *Eclipse Application* in the left tab, double click on it to create a new configuration.
You can now choose a name for your new Eclipse application (optional) and go to the *Environment* tab to add the Polybot library.
Click on *New* and add the following variable :

#### For Linux users

```
LD_LIBRARY_PATH = ${workspace_loc:fr.unice.polytech.deantoni.vrep.polybot/vrepLibs/Linux/64Bit}
```

#### For Windows users

```
PATH = ${workspace_loc:fr.unice.polytech.deantoni.vrep.polybot/vrepLibs/Windows/64Bit}
```

Click on *Apply* and then *Debug* or *Run* depending on the type of configuration.
The new Eclipse application will start to run now.

### Create the test project

In this new Eclipse application, create a general project using : *Right click in the Project Explorer tab -> New -> Project... -> General -> Project*
Then click on *Next*, choose a name for your test project, and click on *Finish*

After that, you can :

- Import the example file from my cloning project using : *Right click on your newly created general project -> New -> File -> Advanced*, then tick *Link to file in the system* and browse the example file nammed `test.bot`.
- Create your own file or the DSL using : *Right click on your newly created general project -> New -> File* and choose a file name with the extension `.bot`.

When the file is created/imported in Gemoc, a pop up window appears asking if you want to convert your test project to a Xtext project. Click on *Yes*.

You can now begin to code.

For more details on the language, go to *My language* part.

### Open the scene in V-Rep and run your program

To visualise the robot, you have to launch V-Rep and open the appropriate scene.
To do that, click on *File -> Open scene...* and choose the `polyBotVersusPaintBomb.ttt` file in the `scenes` folder of my project.
Now go back to your Eclipse application with your `.bot` file and click on the little arrow next to the *Run* button. Click on *Run configurations ...* and double click on *Executable model with Gemoc Java engine* on the left tab to create a new Run configuration. Put the path of your `.bot` file in *Model to execute* by browsing and choose the Polybot language in the *Languages* section. Scroll down and go to the last section. Browse the *Main method* and browse the *Main model element path* too (there should be only one for each of them).
Now, click on the *Run* icon on the Eclipse application with your `.bot` file to watch the robot complete your orders.

## My language

### My domain model

<p align="center">
  <img src="https://raw.githubusercontent.com/lgardaire/IDM_DSL_Polybot/master/images/classes_diagram.png" />
</p>

### How to code

Start your file with the keyword **Robot**. You can add the keyword **debug** after it to activate a debug console which displays informations on your robot.
After that, you can start using instructions.

### Available instructions

- **forward** : parameter distance
- **turnRight** : parameter angle in degrees
- **turnLeft** : parameter angle in degrees
- **catch** : no parameter
- **release** : no parameter
- **comeHome** : no parameter
  
⚠ Each instruction ends with a *;* ⚠

### Goto implementation

You can add **label** <name_of_your_label> after your command to have the possibility to come back to this instruction. It's optional.

Each instruction returns a boolean value depending on the result of the action :

- **forward** : true if the robot has found a bomb after moving, false otherwise
- **turnRight** : true if the robot has found a bomb after turning, false otherwise
- **turnLeft** : true if the robot has found a bomb after turning, false otherwise
- **catch** : always true
- **release** : true if at least one bomb remains to catch, false otherwise
- **comeHome** : true if the robot is in the safe zone, false otherwise
  
At the end of the instruction, you can use the **->** command to go to another label. Here two cases :

- If you specify one label, the robot will go to this instruction, whatever the boolean returned
- You can specify two labels separated by **|** : the first one if the boolean returned is true, and the second one if false
  
In this, you can use the labels created, but also *next* and *previous*.
If you don't specify any of it, the robot will continue with the next instruction sequentially.

So a full command looks like :
```
forward 100 label go100 -> next | turn45;
```

*if you have created a label turn45 somewhere, otherwise the robot will stop at this instruction (no crash)*