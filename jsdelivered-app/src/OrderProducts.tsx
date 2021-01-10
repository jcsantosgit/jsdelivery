import CardProduct from './CardProduct';
import './OrderProducts.css';

function OrderProducts(){
    return(
        <div className="container-fluid">
            <div className="row bg-order-products">
                <CardProduct />
                <CardProduct />
                <CardProduct /> 
                <CardProduct />
                <CardProduct />
            </div>
        </div>
    )
}

export default OrderProducts;