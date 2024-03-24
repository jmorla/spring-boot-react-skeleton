import React from "react";
import { register } from './register';
import 'bootstrap/dist/css/bootstrap.css';

function SamplePage() {
    return (
        <div class="container mt-5">
            <div class="jumbotron">
                <h1 class="display-4">Welcome to Our Website!</h1>
                <p class="lead">This is a simple hero unit, a simple Page component for calling extra attention to featured content or information.</p>
                <hr class="my-4" />
            </div>
        </div>
    )
}

register(<SamplePage />)