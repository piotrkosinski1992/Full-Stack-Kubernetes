# Push backend to dockerhub
mvn clean install - maven plugin does the trick

# Push frontend to dockerhub
- npm install
- delete package-lock.json
- docker build --tag piotrek1992/student-app-client:1.0 .

# Run backend locally
run docker-compose file from docker directory
run application with dev profile


#Run whole infrastructure - when UI and backend is deployed to dockerhub
kubectl apply -f mysql-config.yaml
kubectl apply -f mysql-secret.yaml
kubectl apply -f mysql-all.yaml
kubectl apply -f student-app-client-deployment.yaml
kubectl apply -f student-app-client-service.yaml
kubectl apply -f student-app-api-deployment.yaml
kubectl apply -f student-app-api-service.yaml
minikube addons enable ingress
kubectl apply -f student-app-ingress.yaml
minikube ip


#Useful Docker commands
docker ps
docker images
docker rm "containerId"
docker rmi "imageId"

docker login
docker tag my-image piotrek1992/my-repo
docker push piotrek1992/my-repo

docker build -t hello-service:latest .

#Useful kubernetes commands
kubectl get pod/deployment/service
kubectl delete deployment/pod/service
kubectl logs "id"
kubectl describe "id"

kubectl exec -it mongo-85f4f6866f-m5srv -- mongo -u test --authenticationDatabase admin
kubectl exec -it mysql-5b95957449-ss7pq -- mysql -u test123 -h mysql test -p

#TODO
Add CI/CD
Fix issue with mysql credentials
Create two microservices on separate PODs


Credits https://nirajsonawane.github.io/2020/04/25/Deploy-React-Spring-Boot-MongoDB-Fullstack-application-on-Kubernetes/
