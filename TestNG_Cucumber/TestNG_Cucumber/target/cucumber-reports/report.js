$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("loginAndroid.feature");
formatter.feature({
  "line": 2,
  "name": "LoginAndroid",
  "description": "",
  "id": "loginandroid",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginAndroid"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "1. Existing Login",
  "description": "",
  "id": "loginandroid;1.-existing-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user open blu App",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Click Button Yuk Mulai",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user do login by insert registered phone number",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user input correct OTP",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user insert correct password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "successfully login",
  "keyword": "Then "
});
formatter.match({
  "location": "loginAndroidStepDef.user_open_blu_App()"
});
formatter.result({
  "duration": 3568757900,
  "status": "passed"
});
formatter.match({
  "location": "loginAndroidStepDef.click_Button_Yuk_Mulai()"
});
formatter.result({
  "duration": 1492091100,
  "status": "passed"
});
formatter.match({
  "location": "loginAndroidStepDef.user_do_login_by_insert_registered_phone_number()"
});
formatter.result({
  "duration": 9388341300,
  "status": "passed"
});
formatter.match({
  "location": "loginAndroidStepDef.user_input_correct_OTP()"
});
formatter.result({
  "duration": 48815430000,
  "status": "passed"
});
formatter.match({
  "location": "loginAndroidStepDef.user_insert_correct_password()"
});
formatter.result({
  "duration": 7245911900,
  "status": "passed"
});
formatter.match({
  "location": "loginAndroidStepDef.successfully_login()"
});
formatter.result({
  "duration": 39838156300,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "2. Existing Login Negative unregistered phone number",
  "description": "",
  "id": "loginandroid;2.-existing-login-negative-unregistered-phone-number",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "user open blu App",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Click Button Yuk Mulai",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user do login by insert unregistered phone number",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "direct to Biar prosesnya lancar, siapkan ini dulu yuk",
  "keyword": "Then "
});
formatter.match({
  "location": "loginAndroidStepDef.user_open_blu_App()"
});
formatter.result({
  "duration": 11226856700,
  "status": "passed"
});
formatter.match({
  "location": "loginAndroidStepDef.click_Button_Yuk_Mulai()"
});
formatter.result({
  "duration": 1260358600,
  "status": "passed"
});
formatter.match({
  "location": "loginAndroidStepDef.user_do_login_by_insert_unregistered_phone_number()"
});
formatter.result({
  "duration": 13454263000,
  "status": "passed"
});
formatter.match({
  "location": "loginAndroidStepDef.direct_to_Biar_prosesnya_lancar_siapkan_ini_dulu_yuk()"
});
formatter.result({
  "duration": 1423979200,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "3. Existing Login Negative incorrect password",
  "description": "",
  "id": "loginandroid;3.-existing-login-negative-incorrect-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "user open blu App",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "Click Button Yuk Mulai",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user do login by insert registered phone number",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user input correct OTP",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user insert incorrect password",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "display live error Password yang dimasukkan salah",
  "keyword": "Then "
});
formatter.match({
  "location": "loginAndroidStepDef.user_open_blu_App()"
});
formatter.result({
  "duration": 14604793700,
  "status": "passed"
});
formatter.match({
  "location": "loginAndroidStepDef.click_Button_Yuk_Mulai()"
});
formatter.result({
  "duration": 1235032800,
  "status": "passed"
});
formatter.match({
  "location": "loginAndroidStepDef.user_do_login_by_insert_registered_phone_number()"
});
formatter.result({
  "duration": 13922303100,
  "status": "passed"
});
formatter.match({
  "location": "loginAndroidStepDef.user_input_correct_OTP()"
});
formatter.result({
  "duration": 9931625100,
  "status": "passed"
});
formatter.match({
  "location": "loginAndroidStepDef.user_insert_incorrect_password()"
});
formatter.result({
  "duration": 7254954500,
  "status": "passed"
});
formatter.match({
  "location": "loginAndroidStepDef.display_live_error_Password_yang_dimasukkan_salah()"
});
formatter.result({
  "duration": 2561737200,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "4. Existing Login Negative incorrect OTP",
  "description": "",
  "id": "loginandroid;4.-existing-login-negative-incorrect-otp",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "user open blu App",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "Click Button Yuk Mulai",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user do login by insert registered phone number",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user input incorrect OTP",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "display live error Oops… Kode Salah",
  "keyword": "Then "
});
formatter.match({
  "location": "loginAndroidStepDef.user_open_blu_App()"
});
formatter.result({
  "duration": 13268490000,
  "status": "passed"
});
formatter.match({
  "location": "loginAndroidStepDef.click_Button_Yuk_Mulai()"
});
formatter.result({
  "duration": 1193191200,
  "status": "passed"
});
formatter.match({
  "location": "loginAndroidStepDef.user_do_login_by_insert_registered_phone_number()"
});
formatter.result({
  "duration": 13535993500,
  "status": "passed"
});
formatter.match({
  "location": "loginAndroidStepDef.user_input_incorrect_OTP()"
});
formatter.result({
  "duration": 8778584700,
  "status": "passed"
});
formatter.match({
  "location": "loginAndroidStepDef.display_live_error_Oops_Kode_Salah()"
});
formatter.result({
  "duration": 2505961500,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "5. Existing Login Positive fees and rates",
  "description": "",
  "id": "loginandroid;5.-existing-login-positive-fees-and-rates",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 34,
  "name": "user open blu App",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "user click button Fees \u0026 Rates",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "direct to Fees \u0026 Rate Page",
  "keyword": "Then "
});
formatter.match({
  "location": "loginAndroidStepDef.user_open_blu_App()"
});
formatter.result({
  "duration": 14646420800,
  "status": "passed"
});
formatter.match({
  "location": "loginAndroidStepDef.user_click_button_Fees_Rates()"
});
formatter.result({
  "duration": 13436516800,
  "status": "passed"
});
formatter.match({
  "location": "loginAndroidStepDef.direct_to_Fees_Rate_Page()"
});
formatter.result({
  "duration": 3413565400,
  "status": "passed"
});
});