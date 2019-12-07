# Imperative commands to create example above

 * --dry-run flag only prints the object that would be sent to the cluster without really sending it
 * -o yaml outpus the yaml file

## For deployment
```
kubectl run hello --image=laurentiuspilca/saconf2019-e1:v1 --port=8080 --dry-run -o yaml
```

Generates the following yaml:
```
apiVersion: apps/v1
kind: Deployment
metadata:
  creationTimestamp: null
  labels:
    run: hello
  name: hello
spec:
  replicas: 1
  selector:
    matchLabels:
      run: hello
  strategy: {}
  template:
    metadata:
      creationTimestamp: null
      labels:
        run: hello
    spec:
      containers:
      - image: laurentiuspilca/saconf2019-e1:v1
        name: hello
        ports:
        - containerPort: 8080
        resources: {}
status: {}
```

## For service
```
kubectl expose deployment hello --port=8080 --target-port=8080 --type=LoadBalancer --dry-run -o yaml
```
Generates the following yaml:

```
apiVersion: v1
kind: Service
metadata:
  creationTimestamp: null
  labels:
    run: hello
  name: hello
spec:
  ports:
  - port: 8080
    protocol: TCP
    targetPort: 8080
  selector:
    run: hello
  type: LoadBalancer
status:
  loadBalancer: {}
```
