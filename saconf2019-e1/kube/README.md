# Also include imperative commands to create deployment + service

```
# for deployment
kubectl run hello --image=laurentiuspilca/saconf2019-e1:v1 --port=8080

# for service
kubectl create service loadbalancer hello --tcp=8080:8080 --dry-run -o yaml
```

# TODO: test the following commands as the service looks like is not working.
