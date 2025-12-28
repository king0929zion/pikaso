.class public final LU/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:LU/n;

.field public static final c:LU/n;


# instance fields
.field public final a:LF/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LU/n;

    invoke-direct {v0}, LU/n;-><init>()V

    sput-object v0, LU/n;->b:LU/n;

    new-instance v0, LU/n;

    invoke-direct {v0}, LU/n;-><init>()V

    sput-object v0, LU/n;->c:LU/n;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LF/d;

    const/16 v1, 0x10

    new-array v1, v1, [LU/o;

    invoke-direct {v0, v1}, LF/d;-><init>([Ljava/lang/Object;)V

    iput-object v0, p0, LU/n;->a:LF/d;

    return-void
.end method
