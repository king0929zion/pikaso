.class public final Lo0/A0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lt0/g;

.field public final b:Ln/s;


# direct methods
.method public constructor <init>(Lt0/k;Ln/r;)V
    .locals 5

    const/4 v0, 0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p1, Lt0/k;->d:Lt0/g;

    iput-object v1, p0, Lo0/A0;->a:Lt0/g;

    sget-object v1, Ln/k;->a:[I

    new-instance v1, Ln/s;

    invoke-direct {v1}, Ln/s;-><init>()V

    iput-object v1, p0, Lo0/A0;->b:Ln/s;

    const/4 v1, 0x4

    invoke-static {p1, v0, v1}, Lt0/k;->h(Lt0/k;ZI)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lt0/k;

    iget v4, v3, Lt0/k;->g:I

    invoke-virtual {p2, v4}, Ln/r;->b(I)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Lo0/A0;->b:Ln/s;

    iget v3, v3, Lt0/k;->g:I

    invoke-virtual {v4, v3}, Ln/s;->a(I)Z

    :cond_0
    add-int/2addr v2, v0

    goto :goto_0

    :cond_1
    return-void
.end method
