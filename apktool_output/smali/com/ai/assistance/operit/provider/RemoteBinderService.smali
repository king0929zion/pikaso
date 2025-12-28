.class public final Lcom/ai/assistance/operit/provider/RemoteBinderService;
.super Landroid/app/Service;
.source "SourceFile"


# instance fields
.field public d:LG1/h;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    return-void
.end method


# virtual methods
.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    const-string v0, "intent"

    invoke-static {p1, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/ai/assistance/operit/provider/RemoteBinderService;->d:LG1/h;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    const-string p1, "proxyBinder"

    invoke-static {p1}, Lp2/g;->h(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final onCreate()V
    .locals 1

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    new-instance v0, LG1/h;

    invoke-direct {v0}, LG1/d;-><init>()V

    iput-object v0, p0, Lcom/ai/assistance/operit/provider/RemoteBinderService;->d:LG1/h;

    return-void
.end method
