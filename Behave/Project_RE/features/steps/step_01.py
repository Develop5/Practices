# file:features\steps\step_01.py
#--------------------------------------
# STEPS:
#--------------------------------------
from behave import given, when, then

@given('the house is {house_conditions}')
def step_house_conditions(context, house_conditions):
    context.house=House(house_conditions)

@when('the price is {price_level}')
def step_price_too(context, price_level):
    context.house.price=price_level
 
@then('the rep must {hisreaction}')
def step_the_rep_must(context, hisreaction):
    assert hisreaction==context.house.decision()



#--------------------------------------
# PROBLEM DOMAIN:
#--------------------------------------

class House(object):
    '''
    Domain model for house acquisition
    '''
    # pylint: disable = R0903

    def __init__(self, hconditions=None, look=None):
        self.hconditions = hconditions
        self.price = None

    def decision(self):
        '''
        Business logic about when to buy a dwelling
        '''
        assert self.hconditions is not None
        assert self.price is not None
        if self.price == "too high":
            return "not buy"
        if self.price == "too low":
            return "suspect"
        else:
            return "take his own risks"
        
        
    




