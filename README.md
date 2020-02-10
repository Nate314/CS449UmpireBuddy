# UMKC CS449 Lab2 - Umpire Buddy 2.0

There are 2 events that you must check for:
If the batter strikes out, or walks. The umpire buddy should perform as follows, based on which event occurs first:
- If the number of strikes == 3, then the batter has struck out. A popup should appear that says "Out!" The popup will need a button or icon to clear it--any built-in functionality in the message window is fine for this.
- If the number of balls == 4, then the batter should walk. A popup should appear that says "Walk!" Again, you will need a way to close this window.
- In either case, the Umpire Buddy should not allow any more balls or strikes to be recorded; everything except the reset button should be disabled.

Also add an "About" button showing a new screen or window, containing the name of the program (Umpire Buddy 2.0), and your name.

# UMKC CS449 Lab1 - Umpire Buddy 1.0

For lab #1, implement Umpire Buddy, version 1.0.

This is a simple Android app with a single window and 2 data items. The app is for baseball umpires to keep track of the balls and strikes for each batter. It needs 2 counters, 1 for balls and 1 for strikes, and the following interface features:

It should display the current count of each (and of course, it should be clear which is which).

A button for each that increments that counter by one and updates the display.

A 'Reset' button that restores both counters to 0 and updates the display accordingly.

An 'Exit' button to end the app.
