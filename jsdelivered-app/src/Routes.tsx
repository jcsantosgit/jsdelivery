import { BrowserRouter, Route, Switch } from "react-router-dom";
import Header from "./header/Header";
import Home from "./home/Home";
import OrderAddress from "./OrderAddress";
import Orders from './Orders';

function Routes(){
    return (
        <BrowserRouter>
        <Header />
        <Switch>
            <Route path="/orders">
                <Orders />
            </Route>
            <Route path="/address">
                <OrderAddress />
            </Route>            
            <Route path="/">
                <Home />
            </Route>
        </Switch>
        </BrowserRouter>
    )
}

export default Routes;