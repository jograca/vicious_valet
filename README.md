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

Additional functionality was added on Novembrer 9th to allow for a car to be removed.

### Homework Note:

Task was to alert a user on screen when the lot is full. The following was done to achieve this:

Utilizes `isLotFull()` method in the Lot class.

The AppController gets updated with a new variable: `private boolean full;`

RequestMapping in AppController calls the isLotFull() method and assigns its response to the variable in this line: `full = carLot.isLotFull();` 

* If "true" is returned from isLotFull() - "full = true." 
* If "false" is returned from isLotFull() - "full = false" 

ModelAndView in AppController gets updated the following addObject: `mv.addObject("full", full);` This makes the value of the variable accessible to the app.html in order to use mustache.js templates to manipulate the View.

app.html was updated with the following list item:

`<p><b><font color="red"> {{#full}} The lot is now full! {{/full}}</font></b></p>`

This conditional (in Mustache dentoted with a #) will only display when the variable is populated, thus will only appear on the screen when:

* "full" variable is set to 'true' and thus:
* isLotFull() returns "true"

To reverse this conditional (display when "full" is set to "false" the following lines could be tested:

`<p><b><font color="blue"> {{^full}} The has spaces {{/full}}</font></b></p>`
