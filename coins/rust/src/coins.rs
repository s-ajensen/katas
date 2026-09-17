#[derive(Default)]
pub struct Change {
    pub pennies: u32,
    pub nickels: u32,
    pub dimes: u32,
    pub quarters: u32
}

pub fn get_change(mut coins: u32) -> Change {
    let mut change = Change::default();

    change.quarters = coins / 25;
    coins -= change.quarters * 25;

    change.dimes = coins / 10;
    coins -= change.dimes * 10;

    change.nickels = coins / 5;
    coins -= change.nickels * 5;

    change.pennies = coins;
    change
}