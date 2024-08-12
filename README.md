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
1) **activity_main.xml** -- Main activity of the project where  View Button is implemented
2) **activity_productlist.xml** -- When the View Button is clicked the layout gets redirected to productlist layout where the item Recyclerview is implemented
3) **item_product.xml** -- To display the Product thumbnail image, Product title and description of the product
4) **activity_product_description.xml** -- This layout is used as the third layout to view the description and all the other details of the project

## Backend Java Code
1) **Product.java**
      - **Code Functionality**
           - The Product class is a model representing the essential details of a product in the ProductDetails Android application.
           - It includes various attributes like  id, title, description, category, price, discountPercentage, rating, images, thumbnail, stock, brand etc.
           - The class provides getters and setters for each attribute, enabling easy data manipulation and retrieval within the application.
           - This class is integral for managing and displaying product information across different screens of the app.

2) **ProductList.java**
      - **Code Functionality**
           - The ProductList class serves as the main activity for displaying a list of products in an Android application.
           - It utilizes a RecyclerView to present products retrieved from an API and manages the interaction between the user interface and the data source.
           - RecyclerView Setup: Initializes a RecyclerView with a linear layout and binds it to a custom ProductAdapter, which manages the display of product    
             items.
           - Dynamic Data Loading: Fetches product data from a remote API using Retrofit. Upon successful retrieval, the data is added to the list and the adapter               is notified to update the UI.

3) **ProductAdapter.java**
      - **Code Functionality**
           - The ProductAdapter class is a custom RecyclerView adapter designed to handle and display a list of products in an Android application.
           - This adapter manages different types of views within the RecyclerView, such as product titles and product details.
           - View Binding: Utilizes the ProductViewHolder to bind product data to the UI elements, including loading images using the Glide library
           - Intent Handling: Facilitates navigation to the ProductDetails activity by passing product details via intent when a product item is clicked.
           
   
   
   
   
