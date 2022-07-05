@LoginAndroid
Feature: LoginAndroid

  Scenario: 1. Existing Login
    Given user open blu App
    And Click Button Yuk Mulai
    When user do login by insert registered phone number
    And user input correct OTP
    And user insert correct password
    Then successfully login

  Scenario: 2. Existing Login Negative unregistered phone number
    Given user open blu App
    And Click Button Yuk Mulai
    When user do login by insert unregistered phone number
    Then direct to Biar prosesnya lancar, siapkan ini dulu yuk

  Scenario: 3. Existing Login Negative incorrect password
    Given user open blu App
    And Click Button Yuk Mulai
    When user do login by insert registered phone number
    And user input correct OTP
    And user insert incorrect password
    Then display live error Password yang dimasukkan salah

  Scenario: 4. Existing Login Negative incorrect OTP
    Given user open blu App
    And Click Button Yuk Mulai
    When user do login by insert registered phone number
    And user input incorrect OTP
    Then display live error Oops… Kode Salah

  Scenario: 5. Existing Login Positive fees and rates
    Given user open blu App
    When user click button Fees & Rates
    Then direct to Fees & Rate Page


