describe('Android Native Features Test', ()=> {
      it('AppPackage and AppActivity - Access an Activity Directly', async ()=> {
            //access activity
            await driver.startActivity("io.appium.android.apis", "io.appium.android.apis.app.AlertDialogSamples");

            await driver.pause(3000);

            await expect(await $('//*[@text = "App/Alert Dialogs"]')).toExist();
      })

      it('Working with dialig boxes or alert', async ()=> {
            //access activity
            await driver.startActivity("io.appium.android.apis", "io.appium.android.apis.app.AlertDialogSamples");
            await $('~OK Cancel dialog with a message').click();
            //get alert text
            await driver.getAlertText();
            //accept alert
            // await driver.acceptAlert();
            //accept alert
            await driver.dismissAlert();
            await expect(await $('//*[@resource-id = "android:id/alertTitle"]')).not.toExist();
      })

      it('Vertical scrolling', async ()=> {
            await $('~App').click();
            await $('~Activity').click();
            //vertical scroll to the end
            await $('android=new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1, 5)');

            //vertical scroll to the element with its text
            await $('android=new UiScrollable(new UiSelector().scrollable(true)).scrollTextIntoView("Secure Surfaces")').click();

            // await $('~Secure Surfaces').click();            
            await expect(await $('~Secure Window')).toExist();
      })

      it('Horizontal scrolling', async ()=> {
            await driver.startActivity()
            
            //Horizontal scrolling
            await $('android=new UiScrollable(new UiSelector().scrollable(true)).scrollTextIntoView("Secure Surfaces")').click();

            // await $('~Secure Surfaces').click();            
            await expect(await $('~Secure Window')).toExist();
      })

})