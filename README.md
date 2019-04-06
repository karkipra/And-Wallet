# And Wallet

Income and Expenditure Android app with persistent storage using *Room*.

## Motivation

After learning many of the intermediate concepts of Android Development, I wanted to implement it in an application which would consider all these technologies. These include multiple activities, persistent storage, variables shared between multiple activies. And Wallet is the perfect application of these concepts; there are many real life uses of this fun project. Please read more about it in the [features](https://github.com/karkipra/And-Wallet/#Features).

## Screenshots

###### Login Screen

<img src="/Screenshots/aw-1.png?raw=true"  width="400" height="700">
<br />

###### Adding Income 
<img src="/Screenshots/aw-2.png?raw=true"  width="400" height="700">
<br />

###### Adding Expense 

<img src="/Screenshots/aw-3.png?raw=true"  width="400" height="700">
<br />

###### Summary Screen

<img src="/Screenshots/aw-4.png?raw=true"  width="400" height="700">
<br />

## Features

- The application includes these core features:
    - Login screen with password.
    - Keeps track of income and expenses.
    - Summary screen with totals so far. 

**Room** was key in this project as it allows persitent storage for the application to be accessible for multiple uses. An application such a virtual wallet should allow for the local storage of input, which is made accessible by the Android Library [Room](https://developer.android.com/topic/libraries/architecture/room). A visual usage of Room with respect the Android architecture can be found below:

<br />
<img src="/Screenshots/room.png?raw=true"  width="800" height="400">
<br />

## Directions for installation

Best way is to use Android Studio. You can directly clone it with git and open in Android Studio: 
<br />
``` git clone https://github.com/karkipra/And-Wallet.git```
<br />

Another method would be to open it in Android Studio directly with 'import project from git'. 

## Future Updates

- Login with Firebase.
- Have specific items, e.g. food or clothing, for income or expense.
- Integration with shopping cart app to allow ease of access with shopping.
- Linking with bank account to see how it matches up with savings.  