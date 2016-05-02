# SwipeAwayDialog

[![Platform](https://img.shields.io/badge/platform-android-green.svg)](http://developer.android.com/index.html)
<img src="https://img.shields.io/badge/license-MIT-green.svg?style=flat">
[![API](https://img.shields.io/badge/API-12%2B-yellow.svg?style=flat)](https://android-arsenal.com/api?level=12)
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-SwipeAwayDialog-green.svg?style=true)](http://android-arsenal.com/details/1/3519)

Android DialogFragment that enables Dialog to be swiped away to dismiss.  
It's extremely easy to make Tinder-like UI.

![](https://raw.githubusercontent.com/wiki/kakajika/SwipeAwayDialog/images/octocats.gif)

![](https://raw.githubusercontent.com/wiki/kakajika/SwipeAwayDialog/images/dialogs.gif)

## Install

```groovy
dependencies {
    compile 'com.labo.kaji:swipeawaydialog:0.1.0'
}
```

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

## License

MIT License.
