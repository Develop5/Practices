

- In Heroku main page, test:
    - [ ] Title and subtitle
    - [ ] URL
    - [ ] Visibility of the list. Link text and other texts for each
    - [ ] Correct link for each page
    - [ ] "Fork me..." visible and in green. And properly linked
    - [ ] "Powered by"
- From Heroky main page, test navigation to each of child pages
    - [ ] New URL for each
    - [ ] Navigate back and verify the URL corresponds to Heroku main page
- Once in another page, test it thoroughly:
    * [ ] A/B testing
        * [ ] Title
        * [ ] "Fork me ..." and properly linked
        * [ ] "Powered by..."
        * [ ] Body text

    * [ ] Add/Remove Elements
        * [ ] Title
        * [ ] "Fork me ..." and properly linked
        * [ ] "Powered by..."
        * [ ] Every time you click Add Element, a Delete button is shown
        * [ ] When you click Delete, a Delete button disappears

    * [ ] Basic Auth
        * [ ] An popup to sign in is shown
            * [ ] If you cancel, the popup disappears and you get "Not authorized"
            * [ ] If sign in (admin admin), the popup disappears and you receive congratulations. Check:
                * [ ] Title
                * [ ] Content of the congratulation message
                * [ ] "Fork me ..." and properly linked
                * [ ] "Powered by..."

    * [ ] Broken Images
        * [ ] Title
        * [ ] "Fork me ..." and properly linked
        * [ ] "Powered by..."
        * [ ] Two images are broken, the third is not

    * [ ] Challenging DOM
        * [ ] Title
        * [ ] "Fork me ..." and properly linked
        * [ ] "Powered by..."
        * [ ] Click each element in the canvas and check what happens. Check the Answer box
        * [ ] Screenshot and mask each element in the table

    * [ ] Checkboxes
        * [ ] Title
        * [ ] "Fork me ..." and properly linked
        * [ ] "Powered by..."
        * [ ] Check initial status: 1 unchecked, 2 checked
        * [ ] Click 1 and verify both are checked
        * [ ] Click 2 and verify only 1 is checked
        * [ ] Click 1 and verify both are unchecked

    * [ ] Context Menu
        * [ ] Title
        * [ ] "Fork me ..." and properly linked
        * [ ] "Powered by..."
        * [ ] Text content in the body
        * [ ] Right-click the box and a popup must be shown
            * [ ] Accept the popup and a Javascript alert must be shown

    * [ ] Digest Authentication
        * (Looks like not available)

    * [ ] Disappearing Elements
        * [ ] Title
        * [ ] "Fork me ..." and properly linked
        * [ ] "Powered by..."
        * [ ] Text content in the body
        * [ ] Click each button
            * [ ] "Home" goes back to Heroku main page
            * [ ] "About", "Contact us", "Portfolio" navigate to corresponding URLs and the text is "Not found"

    * [ ] Drag and Drop
        * [ ] Title
        * [ ] "Fork me ..." and properly linked
        * [ ] "Powered by..."
        * [ ] Drag frame B to the left (A postion) and check names/positions have changed
        * [ ] Drag frame B back to its original position and check names/positions
        * [ ] Drag frame A to the left (B postion) and check names/positions have changed
        * [ ] Drag frame A back to its original position and check names/positions
        * [ ] Drag frame A down (out of B position) and see nothing changes
        * [ ] Drag frame B up (out of A position) and see nothing changes

    * [ ] Dropdown List
        * [ ] Title
        * [ ] "Fork me ..." and properly linked
        * [ ] "Powered by..."
        * [ ] Select Option 1 from the dropdown list and verify it is settled
        * [ ] Select Option 2 from the dropdown list and verify it is settled

    * [ ] Dynamic Content
        * [ ] Title
        * [ ] "Fork me ..." and properly linked
        * [ ] "Powered by..."
        * [ ] Body text content
        * [ ] Image and text content for the first 2 elements
        * [ ] Click the link indicated and check that image and text content change for the 3rd element

    * [ ] Dynamic Controls
        * [ ] Title
        * [ ] "Fork me ..." and properly linked
        * [ ] "Powered by..."
        * [ ] Body text content
        * [ ] Visibility of Remove/add and Enable/disable subtitles
        * For Remove/add:
            * [ ] A Remove button is shown
            * [ ] A aheckbox is shown
                * [ ] Check and uncheck the checkbox and verify the status each time
            1. Click Remove
            * [ ] A wait bar icon is visible
            * [ ] Once the "wait for it" bar is gone, the checkbox is gone as well.
            * [ ] And an Add button is in place
            2. Click Add
                * [ ] A wait bar icon is visible
                * [ ] Once the "wait for it" bar is gone, the checkbox is back.
                * [ ] And an Remove button is in place again
        * For Enable/disable:
            * [ ] A disabled box is shown
            * [ ] A Enable button is shown
            1. Click Enable
                * [ ] A wait bar icon becomes visible
                * [ ] After a while a label "It's enabled!" is visible. The wait bar is still there
                    * [ ] A text can be written in the box
                    * [ ] A Disable button is shown
            2. Click Disable
                * [ ] Both wait bar icons remain visible
                * [ ] he Enable button is shown again
                * [ ] The box is disabled and contains the last text written in it.

    * [ ] Dynamic Loading
        * [ ] Title
        * [ ] "Fork me ..." and properly linked
        * [ ] "Powered by..."
        * [ ] Body text content
        * ### Difference between Example 1 and Example 2 **NOT clear** in behaviour ###
        * [ ] Click Example 1
            * Check new URL
            * [ ] Title
            * [ ] "Fork me ..." and properly linked
            * [ ] "Powered by..."
            * [ ] Subtitle
            * [ ] Start button visible. Click
            * [ ] Click Start
                * [ ] A wait bar icon is visible
                * [ ] When the wait bar icon is gone, a "Hello World!" text is shown in the page
        * [ ] Click Example 2
            * (The same behaviour as for Example 1)

    * [ ] Entry Ad
        * [ ] Title
        * [ ] "Fork me ..." and properly linked
        * [ ] "Powered by..."
        * [ ] A modal window is shown
        * [ ] Verify title, text content and Close button present in modal window
        1. Close the modal window
        2. [ ] Reload the page and verify that the modal window does not popup anymore.
        3. Navigate back to home and come again to Entry Ad
            * [ ] Check that the modal window is not shown
        4. Re-enable it by clicking the indicated link
        5. Navigate back to home and come again to Entry Ad
            * [ ] Check that te model window is back again

    * [ ] Exit Intent
        * [ ] Title
        * [ ] "Fork me ..." and properly linked
        * [ ] "Powered by..."
        1. Mouse out over the upper part of the browser window
            * [ ] A modal window is shown
            * [ ] Check title, content and visibility of the Close button
        2. Close the modal window
        3. Reload the page
        4. Mouse out over the upper side of the browser
            * [ ] The modal windows is shown again

    * [ ] File download
        * [ ] Title
        * [ ] "Fork me ..." and properly linked
        * [ ] "Powered by..."
        * [ ] Name of 4 files as links
        * [ ] Click each file and a download should start
        * [ ] Verify content or correct format of each file downloaded

    * [ ] File Upload
        * [ ] Title
        * [ ] "Fork me ..." and properly linked
        * [ ] "Powered by..."
        * [ ] "Elegir archivo" button with a following text
        * [ ] Upload button is shown
        * [ ] A box with red dashed line is shown
        * Click Elegir archivo
            1. Choose LambdaTest.txt
            2. Click Upload
            3. [ ] the new URL is http://the-internet.herokuapp.com/upload
            4. [ ] A message "File Uploaded!" is shown
            5. [ ] The name of the selected file is in the box
        * Click the red square
            1. A dialog box pops up to choose a file. Select LambdaTest.txt
            2. [ ] The name of the file is shown in the red box, followed by a checkmark
            3. Click Upload
            4. [ ] the new URL is http://the-internet.herokuapp.com/upload
            5. [ ] A message "File Uploaded!" is shown
            6. [ ] The name of the selected file is in the box

    * [ ] Floating Menu
        * [ ] Title
        * [ ] "Fork me ..." and properly linked
        * [ ] "Powered by..."
        * [ ] Body text content
        * [ ] "Home", "News", "Contact" and "About" buttons are visible
        * [ ] Click each of them and verify that "#" with the corresponding name is added to the URL

    * [ ] 
    
