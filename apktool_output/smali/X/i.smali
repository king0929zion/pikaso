.class public abstract LX/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ln/r;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    sget-object v0, LX/e;->c:LX/r;

    iget v1, v0, LX/c;->c:I

    shl-int/lit8 v2, v1, 0x6

    or-int/2addr v1, v2

    new-instance v2, LX/f;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v0, v3}, LX/h;-><init>(LX/c;LX/c;I)V

    sget-object v3, LX/e;->t:LX/m;

    iget v4, v3, LX/c;->c:I

    shl-int/lit8 v4, v4, 0x6

    iget v5, v0, LX/c;->c:I

    or-int/2addr v4, v5

    new-instance v6, LX/h;

    const/4 v7, 0x0

    invoke-direct {v6, v0, v3, v7}, LX/h;-><init>(LX/c;LX/c;I)V

    shl-int/lit8 v5, v5, 0x6

    iget v8, v3, LX/c;->c:I

    or-int/2addr v5, v8

    new-instance v8, LX/h;

    invoke-direct {v8, v3, v0, v7}, LX/h;-><init>(LX/c;LX/c;I)V

    sget-object v0, Ln/j;->a:Ln/r;

    new-instance v0, Ln/r;

    invoke-direct {v0}, Ln/r;-><init>()V

    invoke-virtual {v0, v1, v2}, Ln/r;->i(ILjava/lang/Object;)V

    invoke-virtual {v0, v4, v6}, Ln/r;->i(ILjava/lang/Object;)V

    invoke-virtual {v0, v5, v8}, Ln/r;->i(ILjava/lang/Object;)V

    sput-object v0, LX/i;->a:Ln/r;

    return-void
.end method
