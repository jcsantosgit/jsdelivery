import { Link } from 'react-router-dom';
import CardProduct from './CardProduct';
import './OrderProducts.css';
import { Product } from './types';

type Props = {
    products: Product[];
}

function OrderProducts({ products }: Props){

    return(
        <>
        <div className="container-fluid order-container">
            <div className="row bg-order-products">
                {products.map(p => (
                    <CardProduct key={p.id} product={p} />
                ))}
            </div>
        </div>
        <div className="order-continue">
            <Link to="/address" className="btn btn-warning">
                <span>Continuar</span>
            </Link>
        </div>
        </>
    )
}

export default OrderProducts;