# file:features\steps\step_02.py
#--------------------------------------
# STEPS:
#--------------------------------------
from behave import given, when, then

@given('the house looks {house_appearance}')
def step_house_look(context, house_appearance):
    context.house=House(house_appearance)

@when('the client {taste}')
def step_client(context, taste):
    context.house.client=taste

@then('the rep should {repreaction}')
def step_the_rep_should(context, repreaction):
    assert repreaction==context.house.decision()



#--------------------------------------
# PROBLEM DOMAIN:
#--------------------------------------

class House(object):
    '''
    Domain model for house acquisition
    '''
    # pylint: disable = R0903

    def __init__(self, hlook=None):
        self.hlook = hlook
        self.client = None

    def decision(self):
        '''
        Business logic about when to buy a dwelling
        '''
        assert self.hlook is not None
        assert self.client is not None
        if self.client == "does not like it":
            return "not buy"
        if "not so much" in self.client:
            return "consider risks"
        if self.client == "is delighted":
            return "buy immediately"
        else:
            return "think twice about it"
        
        
    




