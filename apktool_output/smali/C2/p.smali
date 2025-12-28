.class public final LC2/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg2/i;


# instance fields
.field public final d:Ljava/lang/Throwable;

.field public final synthetic e:Lg2/i;


# direct methods
.method public constructor <init>(Lg2/i;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LC2/p;->d:Ljava/lang/Throwable;

    iput-object p1, p0, LC2/p;->e:Lg2/i;

    return-void
.end method


# virtual methods
.method public final e(Lg2/h;)Lg2/i;
    .locals 1

    iget-object v0, p0, LC2/p;->e:Lg2/i;

    invoke-interface {v0, p1}, Lg2/i;->e(Lg2/h;)Lg2/i;

    move-result-object p1

    return-object p1
.end method

.method public final i(Lg2/i;)Lg2/i;
    .locals 1

    iget-object v0, p0, LC2/p;->e:Lg2/i;

    invoke-interface {v0, p1}, Lg2/i;->i(Lg2/i;)Lg2/i;

    move-result-object p1

    return-object p1
.end method

.method public final l(Ljava/lang/Object;Lo2/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LC2/p;->e:Lg2/i;

    invoke-interface {v0, p1, p2}, Lg2/i;->l(Ljava/lang/Object;Lo2/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final n(Lg2/h;)Lg2/g;
    .locals 1

    iget-object v0, p0, LC2/p;->e:Lg2/i;

    invoke-interface {v0, p1}, Lg2/i;->n(Lg2/h;)Lg2/g;

    move-result-object p1

    return-object p1
.end method
