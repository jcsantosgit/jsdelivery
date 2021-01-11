import CardProduct from './CardProduct';
import './OrderProducts.css';
import { Product } from './types';

type Props = {
    products: Product[];
}

function OrderProducts({ products }: Props){

    return(
        <div className="container-fluid">
            <div className="row bg-order-products">
                {products.map(p => (
                    <CardProduct key={p.id} product={p} />
                ))}
            </div>
        </div>
    )
}

export default OrderProducts;