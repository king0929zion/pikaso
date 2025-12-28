.class public final LC2/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg2/d;
.implements Li2/d;


# instance fields
.field public final d:Lg2/d;

.field public final e:Lg2/i;


# direct methods
.method public constructor <init>(Lg2/d;Lg2/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC2/y;->d:Lg2/d;

    iput-object p2, p0, LC2/y;->e:Lg2/i;

    return-void
.end method


# virtual methods
.method public final j()Li2/d;
    .locals 2

    iget-object v0, p0, LC2/y;->d:Lg2/d;

    instance-of v1, v0, Li2/d;

    if-eqz v1, :cond_0

    check-cast v0, Li2/d;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final o()Lg2/i;
    .locals 1

    iget-object v0, p0, LC2/y;->e:Lg2/i;

    return-object v0
.end method

.method public final t(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LC2/y;->d:Lg2/d;

    invoke-interface {v0, p1}, Lg2/d;->t(Ljava/lang/Object;)V

    return-void
.end method
