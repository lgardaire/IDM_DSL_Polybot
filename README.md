# IDM_DSL_Polybot

DSL implementation for a robot Polybot in Vrep

## Developer
Loïc Gardaire

## How to use my project

After cloning the project, open `GemocStudio` and import the project using : *File -> Import -> General -> Projects From Folders or Archive* and choose the cloning project folder.

After that, you have to create a Runtime Eclipse Application and link the Polybot library.

### Link the Polybot library
To link the Polybot library, you need to add an environment variable to the launching configuration of the new Eclipse application.

#### For Linux users
```
LD_LIBRARY_PATH = ${workspace_loc:fr.unice.polytech.deantoni.vrep.polybot/vrepLibs/Linux/64Bit}
```

#### For Windows users
```
PATH = ${workspace_loc:fr.unice.polytech.deantoni.vrep.polybot/vrepLibs/Windows/64Bit}
```

### Create the test project

In this new Eclipse application, create a general project using : *Right click in the Project Explorer tab -> New -> Project... -> General -> Project*

After that, you can :
- Import the example file from my cloning project using : *Right click on your newly created general project -> New -> File -> Advanced*, then tick *Link to file in the system* and browse the example file nammed `test.bot`.
- Create your own file or the DSL using : *Right click on your newly created general project -> New -> File* and choose a file name with the extension `.bot`.

The fun can now begin