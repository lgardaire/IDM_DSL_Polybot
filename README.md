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
Choose the *Eclipse Application* in the left tab, click on the little arrow to open the list and choose *Launch Runtime Eclipse*
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

The fun can now begin ! You can begin to code.

### Open the scene in V-Rep and run your program

To visualise the robot, you have to launch V-Rep and open the appropriate scene.
To do that, click on *File -> Open scene...* and choose the `polyBotVersusPaintBomb.ttt` file in the `scenes` folder of my project.
Now, click on the *Run* icon on the Eclipse application with your `.bot` file to watch the robot complete your orders.