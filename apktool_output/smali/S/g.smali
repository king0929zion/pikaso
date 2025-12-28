.class public final Ls/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LB2/v;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LB2/v;

    const/4 v1, 0x0

    const/16 v2, 0x10

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, LB2/v;-><init>(III)V

    iput-object v0, p0, Ls/g;->a:LB2/v;

    return-void
.end method


# virtual methods
.method public final a(Ls/f;Li2/j;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ls/g;->a:LB2/v;

    invoke-virtual {v0, p1, p2}, LB2/v;->b(Ljava/lang/Object;Lg2/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lh2/a;->d:Lh2/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1
.end method

.method public final b(Ls/f;)V
    .locals 1

    iget-object v0, p0, Ls/g;->a:LB2/v;

    invoke-virtual {v0, p1}, LB2/v;->q(Ljava/lang/Object;)Z

    return-void
.end method
