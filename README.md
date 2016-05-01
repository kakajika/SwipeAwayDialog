# SwipeAwayDialog
Android DialogFragment that enables Dialog to be swiped away to dismiss.  
It's extremely easy to make Tinder-like UI.

![](https://raw.githubusercontent.com/wiki/kakajika/SwipeAwayDialog/images/octocats.gif)

![](https://raw.githubusercontent.com/wiki/kakajika/SwipeAwayDialog/images/dialogs.gif)

## Usage

Just extend `SwipeAwayDialogFragment` instead of `DialogFragment`.

```java
public class ExampleDialogFragment extends SwipeAwayDialogFragment {
    // Implement DialogFragment as usual.
}
```

If you want to handle swiped away event, implement `onSwipedAway`.  
You can prevent dismissing by returning true.

```java
@Override
public boolean onSwipedAway(boolean toRight) {
    return false;
}
```
