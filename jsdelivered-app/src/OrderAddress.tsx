import { Link } from 'react-router-dom';
import './OrderAddress.css';

function OrderAddress(){
    return(
       <div className="container-fluid">
            <input type="text" className="search-address" />
            <div className="map-container">
            </div>   

            <Link to="/orders" className="btn btn-outline-dark order-btn-return">
                Voltar
            </Link>
       </div> 
    );
}

export default OrderAddress;