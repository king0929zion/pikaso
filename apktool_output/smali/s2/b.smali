.class public final Ls2/b;
.super Ls2/a;
.source "SourceFile"


# instance fields
.field public final f:Lo0/U;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ls2/d;-><init>()V

    new-instance v0, Lo0/U;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lo0/U;-><init>(I)V

    iput-object v0, p0, Ls2/b;->f:Lo0/U;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Random;
    .locals 2

    iget-object v0, p0, Ls2/b;->f:Lo0/U;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Lp2/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Random;

    return-object v0
.end method
