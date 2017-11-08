## Vicious Valet Web App

### G4C Project from November 8th

This is the Web App for tracking the cars in the Vicious Valet fleet.

Program will accept the following user inputs:
* License Plate
* State
* Color
* Make
* Model
* Location

Once all inputs are added, the Car is added to the Lot. Once a Lot is full it will no longer accept new cars.

### Homework Note:

Task was to alert a users on screen when the lot is full. The following was done to achieve this:

Utilizes `isLotFull()` method in Lot.java

AppController.java was updated with a new variable: `private boolean full;`

RequestMapping in AppController was updated with the line `full = carLot.isLotFull();` This sets the variable to "full" when the isLotFull() method in Lot.java returns "true"

ModelAndView in AppController was updated with the following addObject: `mv.addObject("full", full);` This makes the value of the variable accessible to the app.html using Mustache templates.

app.html was updated with the following list item:

`<p><b><font color="red"> {{#full}} The lot is now full! {{/full}}</font></b></p>`

This conditional (in Mustache dentoted with a #) will only display when the variable is populated, thus will only appear on the screen when isLotFull() is set to 'true'.

