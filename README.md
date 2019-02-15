# IDM_DSL_Polybot

DSL implementation for a robot Polybot in Vrep

## Developer
Loïc Gardaire

## Link the Polybot library
To link the Polybot library, you need to add an environment variable to the launching configuration of Eclipse.

### For Linux users
```
LD_LIBRARY_PATH = ${workspace_loc:fr.unice.polytech.deantoni.vrep.polybot/vrepLibs/Linux/64Bit}
```

### For Windows users
```
PATH = ${workspace_loc:fr.unice.polytech.deantoni.vrep.polybot/vrepLibs/Windows/64Bit}
```