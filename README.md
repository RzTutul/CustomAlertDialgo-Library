

# CustomAlertDialog--Library
![image](https://user-images.githubusercontent.com/37795928/93122460-5230d900-f6e8-11ea-97a8-9e2212908a44.png)


Add it in your root build.gradle at the end of repositories:
allprojects {
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
Step 2. Add the dependency

	dependencies {
	             implementation 'com.github.RzTutul:CustomAlertDialgo-Library:1.0'
		     implementation 'androidx.cardview:cardview:1.0.0' // or latest version
	}

# Java
  ```
      CustomAlertDialog cad = new CustomAlertDialog();
      cad.SetcustomAlertDialog(this,"Email Confirmation","Email has been sent to the user!","Ok");
```

# Optional, to change diloag attribute properties 

   
  ```
        cad.titleBackground.setBackgroundColor(getResources().getColor(R.color.cardview_dark_background));
        cad.titleText.setTextColor(getResources().getColor(R.color.colorPrimary));
        cad.boxBackground.setCardBackgroundColor(getResources().getColor(R.color.colorAccent));
        cad.boxMsgText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        cad.cadBtn.getBackground().setColorFilter(ContextCompat.getColor(this, R.color.colorPrimary), PorterDuff.Mode.MULTIPLY);
        cad.cadBtn.setTextColor(getResources().getColor(R.color.colorAccent));
```
