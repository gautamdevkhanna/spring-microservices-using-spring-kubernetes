kubectl apply -f k8s
kubectl set image deployments/contactus contactus=dhananjay12/contact-us-service:$SHA
kubectl set image deployments/user user=dhananjay12/user-service:$SHA
kubectl set image deployments/zuul zuul=dhananjay12/zuul-server:$SHA