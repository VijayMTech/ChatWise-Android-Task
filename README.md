## Chatwise Antroid Task Assignment

ANDROID/ IOS:
1) Create an app with 3 screens 
2) First screen will contain a button to view products, Clicking on the button will take user to 2nd screen. 
3) Second screen will contain a list of products which will be fetched from API This recyclerview/ tableview will contains two types of items 1st will be a textview with title - “Products List”,
   Further items will be product list itself.
4) Third screen will contain the detail description of the product. User should navigate to this screen by clicking on any item in the second screen.
5) Make sure there is only 1 recyclerview/ tableview with two types of items in the adapter/cell one for title Text and others for products list. 

## Refer to the Wireframe given in the task
![sample_ui](https://github.com/user-attachments/assets/8df5efbc-0739-4fd7-ba1a-4f0cea4ca431)

## Download the UI and files that are used in this task [Click here](https://drive.google.com/drive/folders/1aGS8Pa6D1tZ3p530wujpPtO6IYDv4By0?usp=drive_link)

API to be used [https://dummyjson.com/products](https://dummyjson.com/products)
API type: GET 

## Notes(Android) 
Use Retrofit for calling API, Use RecyclerView to display data 

## XML Layouts used
1) **activity_main.xml** -- Main activity of the project where the View Button is implemented
2) **activity_productlist.xml** -- When the View Button is clicked the layout gets redirected to productlist layout where the item Recyclerview is implemented
3) **item_product.xml** -- To display the Product thumbnail image, Product title and description of the product
4) **activity_product_description.xml** -- This layout is used as the third layout to view the description and all the other details of the project


   
   
   
   
