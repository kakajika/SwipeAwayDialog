# SwipeAwayDialog
Android DialogFragment that enables Dialog to be swiped away to dismiss.

![](https://raw.githubusercontent.com/wiki/kakajika/SwipeAwayDialog/images/octocats.gif)

## Usage

Use `SwipeAwayDialogFragment` instead of `DialogFragment`.

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
