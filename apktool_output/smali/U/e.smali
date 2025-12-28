.class public final LU/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lo0/n;

.field public final b:LU/d;

.field public final c:Ln/B;

.field public final d:Ln/B;

.field public final e:Ln/B;

.field public final f:Ln/B;


# direct methods
.method public constructor <init>(Lo0/n;LU/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU/e;->a:Lo0/n;

    iput-object p2, p0, LU/e;->b:LU/d;

    sget p1, Ln/E;->a:I

    new-instance p1, Ln/B;

    invoke-direct {p1}, Ln/B;-><init>()V

    iput-object p1, p0, LU/e;->c:Ln/B;

    new-instance p1, Ln/B;

    invoke-direct {p1}, Ln/B;-><init>()V

    iput-object p1, p0, LU/e;->d:Ln/B;

    new-instance p1, Ln/B;

    invoke-direct {p1}, Ln/B;-><init>()V

    iput-object p1, p0, LU/e;->e:Ln/B;

    new-instance p1, Ln/B;

    invoke-direct {p1}, Ln/B;-><init>()V

    iput-object p1, p0, LU/e;->f:Ln/B;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, LU/e;->c:Ln/B;

    invoke-virtual {v0}, Ln/B;->h()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LU/e;->e:Ln/B;

    invoke-virtual {v0}, Ln/B;->h()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LU/e;->d:Ln/B;

    invoke-virtual {v0}, Ln/B;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final b(Ln/B;Ljava/lang/Object;)V
    .locals 8

    invoke-virtual {p1, p2}, Ln/B;->a(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LU/e;->c:Ln/B;

    iget p1, p1, Ln/B;->d:I

    iget-object p2, p0, LU/e;->d:Ln/B;

    iget p2, p2, Ln/B;->d:I

    add-int/2addr p1, p2

    iget-object p2, p0, LU/e;->e:Ln/B;

    iget p2, p2, Ln/B;->d:I

    add-int/2addr p1, p2

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    new-instance p1, LU/d;

    const-class v3, LU/e;

    const-string v4, "invalidateNodes"

    const/4 v1, 0x0

    const-string v5, "invalidateNodes()V"

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p1

    move-object v2, p0

    invoke-direct/range {v0 .. v7}, LU/d;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    iget-object p2, p0, LU/e;->a:Lo0/n;

    invoke-virtual {p2, p1}, Lo0/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
