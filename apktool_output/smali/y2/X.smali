.class public final Ly2/X;
.super Ly2/f;
.source "SourceFile"


# instance fields
.field public final l:Ly2/k;


# direct methods
.method public constructor <init>(Lg2/d;Ly2/k;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Ly2/f;-><init>(ILg2/d;)V

    iput-object p2, p0, Ly2/X;->l:Ly2/k;

    return-void
.end method


# virtual methods
.method public final B()Ljava/lang/String;
    .locals 1

    const-string v0, "AwaitContinuation"

    return-object v0
.end method

.method public final r(Ly2/b0;)Ljava/lang/Throwable;
    .locals 2

    iget-object v0, p0, Ly2/X;->l:Ly2/k;

    invoke-virtual {v0}, Ly2/b0;->M()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ly2/Z;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ly2/Z;

    invoke-virtual {v1}, Ly2/Z;->c()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    instance-of v1, v0, Ly2/m;

    if-eqz v1, :cond_1

    check-cast v0, Ly2/m;

    iget-object p1, v0, Ly2/m;->a:Ljava/lang/Throwable;

    return-object p1

    :cond_1
    invoke-virtual {p1}, Ly2/b0;->f()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    return-object p1
.end method
