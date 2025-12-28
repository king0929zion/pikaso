.class public final LB2/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB2/E;
.implements LB2/e;
.implements LC2/q;


# instance fields
.field public final synthetic d:LB2/G;


# direct methods
.method public constructor <init>(LB2/G;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB2/s;->d:LB2/G;

    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LB2/s;->d:LB2/G;

    invoke-virtual {v0}, LB2/G;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final m(Lg2/i;II)LB2/e;
    .locals 2

    const/4 v0, 0x2

    if-ltz p2, :cond_0

    if-ge p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, -0x2

    if-ne p2, v1, :cond_1

    :goto_0
    if-ne p3, v0, :cond_1

    :goto_1
    move-object v0, p0

    goto :goto_2

    :cond_1
    if-eqz p2, :cond_2

    const/4 v0, -0x3

    if-ne p2, v0, :cond_3

    :cond_2
    const/4 v0, 0x1

    if-ne p3, v0, :cond_3

    goto :goto_1

    :cond_3
    new-instance v0, LC2/i;

    invoke-direct {v0, p0, p1, p2, p3}, LC2/h;-><init>(LB2/e;Lg2/i;II)V

    :goto_2
    return-object v0
.end method

.method public final o(LB2/f;Lg2/d;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LB2/s;->d:LB2/G;

    invoke-virtual {v0, p1, p2}, LB2/G;->o(LB2/f;Lg2/d;)Ljava/lang/Object;

    sget-object p1, Lh2/a;->d:Lh2/a;

    return-object p1
.end method
