public class main {
}

/* define user requirements
user logs in
display how many attack actions they have left that day
    number of attack actions available resets every 24 hours?
        or should a user be able to store their actions, up to a certain cap? don't want to punish people who can't
        play every day. But also don't want to give overwhelming imbalance of power to users who store their actions.
display number of people in their nation
display number of oil barrels they have stored
display number of spies user has
display number of infiltration actions they have left
display offensive power (calculation)
    what kind of units will represent offensive power?
display defensive power
    what kind of units will represent defensive power?
display option to purchase offensive and defensive power
    how does the user earn money? Is that with barrels? Yes. This forces the user to either spend their barrels
    on offensive/defensive power, or to risk saving up their barrels in hopes they have enough power to defend it until
    they can purchase another capacity upgrade
display option to increase total amount of barrel storage for a high percentage of the owned barrels
display infrastructure stats
display option to upgrade infrastructure
    should this be in the same area as the offensive/defensive purchase options?

generate barrels on a short iteration
    how short? how many - how to calculate this in a meaningful way that will scale?
how to make sure users can only attack or be attacked by others will relatively similar power

actions
    user can attack other users to steal oil
    user can sabotage other users oil barrels
        what is the benefit of this? Increase "points" for this user? Successful attempts increase ability to sabotage
        without losing spies? what are the potential risks? Spies dying?
        how to calculate the success rate? Should be some chance, but primarily stat based?
    how often can I attack or sabotage the same user?

test data
    I need to either create temp variables that will initialize every time I run the program, or initialize my data in
    some other way. Mitch suggested serialization? I need to look that up.
*/