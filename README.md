# SwipeAwayDialog
Android DialogFragment that enables Dialog to be swiped away to dismiss.

![](https://raw.githubusercontent.com/wiki/kakajika/SwipeAwayDialog/images/example.gif)

## Usage

Use `SwipeAwayDialogFragment` instead of `DialogFragment`.

```
public class ExampleDialogFragment extends SwipeAwayDialogFragment {

    // Implement DialogFragment as usual.

}
```

If you want to handle swiped away event, implement `onSwipedAway`.
You can prevent dismissing by returning false from this method.

```
@Override
public boolean onSwipedAway() {
    return true;
}
```

And if you want to disable swiping completely, use `setSwipeable`.