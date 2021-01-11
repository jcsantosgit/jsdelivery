import { useEffect, useState } from 'react';
import { fetchProducts } from './api';
import { Product } from './types';

import './Orders.css'

import OrderHeader from './OrderHeader';
import OrderProducts from './OrderProducts';

function Orders(){

    const [products, setProducts] = useState<Product[]>([]);
    console.log(products);

    useEffect(()=>{
        fetchProducts()
        .then(response => setProducts(response.data))
        .catch(error => console.log(error))
    }, [])

    return(
        <>
            <OrderHeader />
            <OrderProducts products={products} />
        </>
    )
}

export default Orders;