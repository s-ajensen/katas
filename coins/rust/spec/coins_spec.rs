use coins::*;

#[test]
fn gets_coins_for_zero_cents() {
    let change = get_change(0);
    assert_eq!(0, change.pennies);
}

#[test]
fn gets_coins_for_one_cent() {
    let change = get_change(1);
    assert_eq!(1, change.pennies);
}

#[test]
fn gets_coins_for_two_cents() {
    let change = get_change(2);
    assert_eq!(2, change.pennies);
}

#[test]
fn gets_coins_for_five_cents() {
    let change = get_change(5);
    assert_eq!(1, change.nickels);
    assert_eq!(0, change.pennies);
}

#[test]
fn gets_coins_for_six_cents() {
    let change = get_change(6);
    assert_eq!(1, change.nickels);
    assert_eq!(1, change.pennies);
}

#[test]
fn gets_coins_for_seven_cents() {
    let change = get_change(7);
    assert_eq!(1, change.nickels);
    assert_eq!(2, change.pennies);
}

#[test]
fn gets_coins_for_ten_cents() {
    let change = get_change(10);
    assert_eq!(1, change.dimes);
    assert_eq!(0, change.nickels);
    assert_eq!(0, change.pennies);
}

#[test]
fn gets_coins_for_twenty_cents() {
    let change = get_change(20);
    assert_eq!(2, change.dimes);
    assert_eq!(0, change.nickels);
    assert_eq!(0, change.pennies);
}

#[test]
fn gets_coins_for_fifteen_cents() {
    let change = get_change(15);
    assert_eq!(1, change.dimes);
    assert_eq!(1, change.nickels);
    assert_eq!(0, change.pennies);
}

#[test]
fn gets_coins_for_eighteen_cents() {
    let change = get_change(18);
    assert_eq!(1, change.dimes);
    assert_eq!(1, change.nickels);
    assert_eq!(3, change.pennies);
}

#[test]
fn gets_coins_for_twenty_five_cents() {
    let change = get_change(25);
    assert_eq!(1, change.quarters);
    assert_eq!(0, change.dimes);
    assert_eq!(0, change.nickels);
    assert_eq!(0, change.pennies);
}

#[test]
fn gets_coins_for_fifty_cents() {
    let change = get_change(50);
    assert_eq!(2, change.quarters);
    assert_eq!(0, change.dimes);
    assert_eq!(0, change.nickels);
    assert_eq!(0, change.pennies);
}

#[test]
fn gets_coins_for_fifty_one_cents() {
    let change = get_change(51);
    assert_eq!(2, change.quarters);
    assert_eq!(0, change.dimes);
    assert_eq!(0, change.nickels);
    assert_eq!(1, change.pennies);
}